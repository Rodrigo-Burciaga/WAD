var ctx = document.getElementById("myChart");

var scatterChart = new Chart(ctx, {
	type: "line",
    data: {
        datasets: [{
            label: 'Funcion cuadrática',
            fill:false,
            borderWidth: 5,
            borderColor: '#ff6384',
            backgroundColor: "#ff6384",
            data: [{
                x: -2,
                y: -9
            }, {
                x: -1,
                y: -8
            }, {
                x: 0,
                y: -5
            },
            {
                x: 1,
                y: 0
            },{
                x: 2,
                y: 7
            },{
                x: 3,
                y: 16
            }
            
            ]
        }]
    },
    options: {
        scales: {
            xAxes: [{
                type: 'linear',
                position: 'bottom'
            }]
    		
        },
    legend: {
        display: true,
        fullWidth: false,
        labels: {
            fillStyle: "red"
            
        }
        
    },
    tooltips: {
        enabled: true,
        callbacks: {

            title: function (tooltipItem, data) { return "Coordenadas(x,y)" },
            label: function(tooltipItems, data) { 
                return "("+tooltipItems.xLabel+"," + tooltipItems.yLabel+")";
            }

        }
    }
    
    }
});

//console.log(typeof(scatterChart))
//console.log(scatterChart.options.toSource())

//typeof

var data=[{
    x: -2,
    y: -9
}, {
    x: -1,
    y: -8
}, {
    x: 0,
    y: -5
},
{
    x: 1,
    y: 0
},{
    x: 2,
    y: 7
},{
    x: 3,
    y: 16
}

] 

alert(data[1].x)
