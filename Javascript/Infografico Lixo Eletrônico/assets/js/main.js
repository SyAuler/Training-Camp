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

  // Centralizar o header
  $(document).ready(function() {
    const heightHeader = $('.header-wrapper').height();
    $('.header-wrapper').css('top', (fun_calcHeight() - heightHeader) / 2);
  });  

  // Inserir a posição inicial de cada janela
  // Armazenar os id's das janelas
  var arr_win = [ '#window-wrapper-1', 
                  '#window-wrapper-2',
                  '#window-wrapper-3',
                  '#window-wrapper-4',
                  '#window-wrapper-5',
                  '#window-wrapper-6' ];

  // Inserir as respectivas posições de margin-top
  $(document).ready(function() { 
    for (var i = 0; i < arr_win.length; i++) {
      $(arr_win[i]).css('top', fun_calcMarginTop(i));
    }
  });

  // Janela 1
    // Centralizar o text da janela 1
    $(document).ready(function() {
      const win1_heightDivText = $('.window-1-text').height();
      const win1_widthDivText = $('.window-1-text').width();
      $('#window-wrapper-1').css('padding-top', ((fun_calcHeight() - win1_heightDivText) / 2));
      $('#window-wrapper-1').css('padding-left', ((fun_calcWidth() - win1_widthDivText) / 2));
    });

  // Janela 2
    // Centralizar os textos
    $(document).ready(function() {
      const win2_heightDivText = $('.window-2-text').height();
      const win2_widthDivText = $('.window-2-text').width();
      $('#window-wrapper-2').css('padding-top', ((fun_calcHeight() - win2_heightDivText) / 2));
      $('#window-wrapper-2').css('padding-left', ((fun_calcWidth() - win2_widthDivText) / 2));
    });

  // Janela 6
    // Centralizar o conteudo
    $(document).ready(function() {
      const win6_heightFooter = $('.footer-content').height();
      const win6_widthFooter = $('.footer-content').width();
      $('#window-wrapper-6').css('padding-top', ((fun_calcHeight() - win6_heightFooter) / 2));
      $('#window-wrapper-6').css('padding-left', ((fun_calcWidth() - win6_widthFooter) / 2));
    });    

// ------------------------------------------------------------------------------
// ANIMAÇÕES               

  // Scroll suave
  $(document).ready(function($) { 
    $('.nav-link').click(function(event) {        
      event.preventDefault();
      $('html,body').animate({scrollTop:$(this.hash).offset().top}, 800);
    });
  });

  // Janela 1
  $(document).ready(function() {
    $('#window-1-h1').addClass('animated fadeInDown delay-1s');
    $('#window-1-p').addClass('animated fadeIn delay-2s');
  });

// ------------------------------------------------------------------------------
// GRAFICO

var randomScalingFactor = function () {
	return Math.round(Math.random() * 100);
};
var ctx = document.getElementById("myChart");
var myChart = new Chart(ctx, {
	type: 'doughnut',
	data: {
		labels: ["Ferro", "Cobre", "Chumbo", "Alumínio", "Zinco", "Ouro", "Prata", "Platina", "Plástico", "Embalagens", "Não Recicláveis"],
		datasets: [{
			label: '# of Votes',
			data: [40, 17, 3, 7, 5, 0.3, 1, 0.7, 15, 5, 5],
			backgroundColor: [
				
				'rgba(255, 159, 64, 0.8)',
				'rgba(54, 162, 235, 0.8)',
				'rgba(255, 99, 132, 0.8)',
				'rgba(75, 192, 192, 0.8)',
				'rgba(153, 102, 255, 0.8)',
				'rgba(185, 165, 125, 0.8)',
				'rgba(15, 110, 175, 0.8)',
				'rgba(190, 215, 100, 0.8)',
				'rgba(80, 195, 160, 0.8)',
				'rgba(95, 135, 175, 0.8)',
				'rgba(240, 130, 205, 0.8)'
			],
			borderColor: [
				'rgba(255, 159, 64, 0.8)',
				'rgba(54, 162, 235, 0.8)',
				'rgba(255, 99, 132, 0.8)',
				'rgba(75, 192, 192, 0.8)',
				'rgba(75, 192, 192, 0.8)',
				'rgba(185, 165, 125, 0.8)',
				'rgba(15, 110, 175, 0.8)',
				'rgba(190, 215, 100, 0.8)',
				'rgba(80, 195, 160, 0.8)',
				'rgba(95, 135, 175, 0.8)',
				'rgba(240, 130, 205, 0.8)'
			],
			borderWidth: 1
		}]

	},
	options: {
		responsive: true,
		legend: {
			position: 'right',
			title: {
				display: true,
				text: "Título aqui",
				scales: {
					yAxes: [{
						gridLines: {
							display: false,
							xAxes: [{
								gridLines: {
									display: false,
									ticks: {
										beginAtZero: true
									}
								}
							}],
						}

					}]
				}
			}
		}
	}
});


// ------------------------------------------------------------------------------
// Tabs
function AbrirPagina(pageName,elmnt,color) {
  var i, conteudo, abas;

conteudo = document.getElementsByClassName("conteudo");
for (i = 0; i < conteudo.length; i++) {
  if (conteudo[i].id != pageName) {
    conteudo[i].style.display = "none";
  }
  }

abas = document.getElementsByClassName("abas");
  for (i = 0; i < abas.length; i++) {
  abas[i].style.backgroundColor = "";
  }

if (document.getElementById(pageName).style.display === 'block') {
  document.getElementById(pageName).style.display = "none";
  document.getElementById(elmnt).style.backgroundColor = "none";
} else {
  document.getElementById(pageName).style.display = "block";
  document.getElementById(elmnt).style.backgroundColor = color;
}
}

document.getElementById("defaultOpen").click();