// ------------------------------------------------------------------------------
// FUNÇÕES

  // Capturar a altura da página
  function fun_calcHeight() {
    return $(window).height();
  }

  // Capturar a largura da página
  function fun_calcWidth() {
    return $(window).width();
  }

  // Calcular a altura inicial da janela
  function fun_calcMarginTop(count) {
    return fun_calcHeight() * count;
  }

// ------------------------------------------------------------------------------
// CONTROLES

  // Inserir a altura das janelas automáticamente
  $(document).ready(function() {
    $('.window-wrapper').css('height', fun_calcHeight());
  });

  //Centralizar o header
  $(document).ready(function() {
    const heightHeader = $('.container').height();
    $('.container').css('margin-top', (fun_calcHeight() - heightHeader) / 2);
  });  

  // Centralizar o text da janela 1
  $(document).ready(function() {
    const heightDivText = $('.window-1-text').height();
    const widthDivText = $('.window-1-text').width();
    $('#window-wrapper-1').css('padding-top', ((fun_calcHeight() - heightDivText) / 2));
    $('#window-wrapper-1').css('padding-left', ((fun_calcWidth() - widthDivText) / 2));
  });

 