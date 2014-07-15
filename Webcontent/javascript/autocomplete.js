var current_ajax = '';

function suggest_key() {
  alert($('#_input_suggest').val());
  getsuggest(current_ajax + '&input=' + $('#_input_suggest').val());
};

function suggest(id, ajaxurl) {
  $('#' + id).focus(function() {
    current_ajax = ajaxurl;
    showSuggest(id);
  });
}

function showSuggest(id) {
  var distance = 10;
  var position = $('#' + id).position();
  var width = $('#' + id).width();
  var height = $('#' + id).height();

  $('#_input_suggest').show();
  $('#_input_search_suggest').show();
  $('#_list_suggest').show();
  var s_height = $('#_input_suggest').height();
  var s_width = $('#_input_suggest').width();
  var ntop = position.top;
  var nleft = position.left + width + distance;

  if (position.left + width + s_width > $(window).width()) {
    nleft = position.left - width - distance;
  }
  $('#_input_suggest').offset({ top : ntop, left : nleft });
  $('#_input_search_suggest').offset({ top : ntop, left : nleft + s_width + 5 });

  $('#_list_suggest').css('min-width', s_width - 6);
  $('#_list_suggest').offset({ top : ntop + s_height + 10, left : nleft  });
  $('#_list_suggest').css('max-width', $(window).width() - nleft - 5);
  $('#_list_suggest').hide();
}

function getsuggest(ajaxurl) {
  $('#_list_suggest li').remove();
  $('#_list_suggest').show();
  var input_text = $('#_input_suggest').val();
  // suggestRetrieveURL("ajaxGetContractSuggest.do");
  suggestRetrieveURL(ajaxurl);
}

// get content from ajax
var suggest_req;
function suggestRetrieveURL(url) {
  if (window.XMLHttpRequest) { // Non-IE browsers
    suggest_req = new XMLHttpRequest();
    suggest_req.onreadystatechange = suggestProcessStateChange;
    try {
      suggest_req.open("GET", url, true);
      suggest_req.setRequestHeader("If-Modified-Since",
          "Sat, 1 Jan 2000 00:00:00 GMT");
    } catch (e) {
      alert(e);
    }
    suggest_req.send(null);
  } else if (window.ActiveXObject) { // IE
    suggest_req = new ActiveXObject("Microsoft.XMLHTTP");
    if (suggest_req) {
      suggest_req.onreadystatechange = suggestProcessStateChange;
      suggest_req.open("GET", url, true);
      suggest_req.send();
    }
  }
}

function suggestProcessStateChange() {
  if (suggest_req.readyState == 4) { // Complete
    if (suggest_req.status == 200) { // OK response
      var arr_suggests = suggest_req.responseText.split("#npo#");
      // var arr_suggests = ['me', 'too', 'u'];
      for ( var index in arr_suggests) {
        $('#_list_suggest').append(
            '<li class="item_suggest"><a title="'
                + arr_suggests[index]
                + '" onclick="javascript:fillbox(\''
                + arr_suggests[index] + '\');">'
                + collapse_text(arr_suggests[index])
                + '</a></li>');
      }
    } else {
      alert("Problem: " + req.statusText);
    }
  }
}

//strim string to 37-40 character
function collapse_text(input_text) {
  var maxlength = 4000;
  if ( maxlength < input_text.length) {
    return input_text.substring(0, 37) + '...';
  }
  return input_text;
}

function fillbox(ret_text) {
  $('#' + current_focus_id).val(ret_text);
  $('#_input_suggest').hide();
  $('#_input_search_suggest').hide();
  $('#_list_suggest').hide();
}