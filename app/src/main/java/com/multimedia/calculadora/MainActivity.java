package com.multimedia.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //Declaración de atributos
    TextView textView_datos, textView_resultado;
    Button button_limpiarPantalla, button_numCero, button_numUno, button_numDos, button_numTres,
            button_numCuatro, button_numCinco, button_numSeis, button_numSiete, button_numOcho, button_numNueve,
            button_punto, button_dividir, button_igual, button_multiplicar, button_sumar, button_restar, button_resto;
    String resultado = "";

    /**
     * Método que nos permite ver la interfaz gráfica hecha en XML.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vinculaciones();

        //Al pulsar botones de números
        button_numCero.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                }
                textView_datos.setText(textView_datos.getText() + "0");;
            }
        });
        button_numUno.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                }
                textView_datos.setText(textView_datos.getText() + "1");
            }
        });
        button_numDos.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                }
                textView_datos.setText(textView_datos.getText() + "2");

            }
        });
        button_numTres.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                }
                textView_datos.setText(textView_datos.getText() + "3");
            }
        });
        button_numCuatro.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                }
                textView_datos.setText(textView_datos.getText() + "4");
            }
        });
        button_numCinco.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                }
                textView_datos.setText(textView_datos.getText() + "5");
            }
        });
        button_numSeis.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                }
                textView_datos.setText(textView_datos.getText() + "6");
            }
        });
        button_numSiete.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                }
                textView_datos.setText(textView_datos.getText() + "7");
            }
        });
        button_numOcho.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                }
                textView_datos.setText(textView_datos.getText() + "8");
            }
        });
        button_numNueve.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                }
                textView_datos.setText(textView_datos.getText() + "9");
            }
        });

        //Al pulsar botones de operaciones
        button_limpiarPantalla.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_resultado.setText("");
                textView_datos.setText("");
            }
        });
        button_punto.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_datos.getText().toString().isEmpty() || textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                } else {
                    String valor = String.valueOf(textView_datos.getText().toString());
                    String ultimoValor = valor.substring(valor.length() - 1);
                    //Este if comprueba que no se puedan poner dos signos seguidos
                    if (ultimoValor.equalsIgnoreCase("*") || ultimoValor.equalsIgnoreCase("+") ||
                            ultimoValor.equalsIgnoreCase("-") || ultimoValor.equalsIgnoreCase("/") ||
                            ultimoValor.equalsIgnoreCase(".") || ultimoValor.equalsIgnoreCase("%")) {
                        textView_datos.setText(textView_datos.getText());
                    } else {
                        textView_datos.setText(textView_datos.getText() + ".");
                    }
                }
            }
        });
        button_resto.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_datos.getText().toString().isEmpty() || textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                } else {
                    String valor = String.valueOf(textView_datos.getText().toString());
                    String ultimoValor = valor.substring(valor.length() - 1);
                    //Este if comprueba que no se puedan poner dos signos seguidos
                    if (ultimoValor.equalsIgnoreCase("*") || ultimoValor.equalsIgnoreCase("+") ||
                            ultimoValor.equalsIgnoreCase("-") || ultimoValor.equalsIgnoreCase("/") ||
                            ultimoValor.equalsIgnoreCase(".") || ultimoValor.equalsIgnoreCase("%")) {
                        textView_datos.setText(textView_datos.getText());
                    } else {
                        textView_datos.setText(textView_datos.getText() + "%");
                    }
                }
            }
        });
        button_dividir.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_datos.getText().toString().isEmpty() || textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                } else {
                    String valor = String.valueOf(textView_datos.getText().toString());
                    String ultimoValor = valor.substring(valor.length() - 1);
                    if (ultimoValor.equalsIgnoreCase("*") || ultimoValor.equalsIgnoreCase("+") ||
                            ultimoValor.equalsIgnoreCase("-") || ultimoValor.equalsIgnoreCase("/") ||
                            ultimoValor.equalsIgnoreCase(".") || ultimoValor.equalsIgnoreCase("%")) {
                        textView_datos.setText(textView_datos.getText());
                    } else {
                        textView_datos.setText(textView_datos.getText() + "/");
                    }
                }
            }
        });
        button_multiplicar.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_datos.getText().toString().isEmpty() || textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                } else {
                    String valor = String.valueOf(textView_datos.getText().toString());
                    String ultimoValor = valor.substring(valor.length() - 1);
                    if (ultimoValor.equalsIgnoreCase("*") || ultimoValor.equalsIgnoreCase("+") ||
                            ultimoValor.equalsIgnoreCase("-") || ultimoValor.equalsIgnoreCase("/") ||
                            ultimoValor.equalsIgnoreCase(".") || ultimoValor.equalsIgnoreCase("%")) {
                        textView_datos.setText(textView_datos.getText());
                    } else {
                        textView_datos.setText(textView_datos.getText() + "*");
                    }
                }
            }
        });
        button_sumar.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_datos.getText().toString().isEmpty() ||textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                    textView_datos.setText("0" + "+");
                } else {
                    String valor = String.valueOf(textView_datos.getText().toString());
                    String ultimoValor = valor.substring(valor.length() - 1);
                    if (ultimoValor.equalsIgnoreCase("*") || ultimoValor.equalsIgnoreCase("+") ||
                            ultimoValor.equalsIgnoreCase("-") || ultimoValor.equalsIgnoreCase("/") ||
                            ultimoValor.equalsIgnoreCase(".") || ultimoValor.equalsIgnoreCase("%")) {
                        textView_datos.setText(textView_datos.getText());//Si el último valor coincide con un operador que no añada más
                    } else {
                        textView_datos.setText(textView_datos.getText() + "+");
                    }
                }
           }
        });

        button_restar.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_datos.getText().toString().isEmpty() || textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                    textView_datos.setText("0" + "-");
                } else {
                    String valor = textView_datos.getText().toString();
                    String ultimoValor = valor.substring(valor.length() - 1);
                    if (ultimoValor.equalsIgnoreCase("*") || ultimoValor.equalsIgnoreCase("+") ||
                            ultimoValor.equalsIgnoreCase("-") || ultimoValor.equalsIgnoreCase("/") ||
                            ultimoValor.equalsIgnoreCase(".") || ultimoValor.equalsIgnoreCase("%")) {
                        textView_datos.setText(textView_datos.getText());
                    } else {
                        textView_datos.setText(textView_datos.getText() + "-");
                    }
                }
            }
        });
        button_igual.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_datos.getText().toString().isEmpty() || textView_resultado.getText().toString().equalsIgnoreCase("Error")) {
                    textView_resultado.setText("");
                    textView_datos.setText("");
                } else {
                    String resultado = resolverOperacion();
                    if(resultado.isEmpty()) {
                        textView_datos.setText(textView_datos.getText());
                    } else {
                        textView_resultado.setText(resultado);
                    }
                }
            }
        });
    }//Fin OnCreate


    /**
     * Método en el que se hacen todas las vinculaciones de las variables definidas en java con los
     * id del XML.
     */
    protected void vinculaciones() {
        //VINCULAMOS VARIABLE JAVA CON ID DEL COMPONENTE CORRESPONDIENTE
        //Vincular al XML
        textView_datos =(TextView) findViewById(R.id.textView_datos);
        textView_resultado = (TextView) findViewById(R.id.textView_resultado);
        //Números
        button_numCero = (Button) findViewById(R.id.button_numCero);
        button_numUno = (Button) findViewById(R.id.button_numUno);
        button_numDos = (Button) findViewById(R.id.button_numDos);
        button_numTres = (Button) findViewById(R.id.button_numTres);
        button_numCuatro = (Button) findViewById(R.id.button_numCuatro);
        button_numCinco = (Button) findViewById(R.id.button_numCinco);
        button_numSeis = (Button) findViewById(R.id.button_numSeis);
        button_numSiete = (Button) findViewById(R.id.button_numSiete);
        button_numOcho = (Button) findViewById(R.id.button_numOcho);
        button_numNueve = (Button) findViewById(R.id.button_numNueve);
        //Operaciones
        button_limpiarPantalla = (Button) findViewById(R.id.button_limpiarPantalla);
        button_punto = (Button) findViewById(R.id.button_punto);
        button_resto = (Button) findViewById(R.id.button_resto);
        button_dividir = (Button) findViewById(R.id.button_dividir);
        button_igual = (Button) findViewById(R.id.button_igual);
        button_restar = (Button) findViewById(R.id.button_restar);
        button_sumar = (Button) findViewById(R.id.button_sumar);
        button_multiplicar = (Button) findViewById(R.id.button_multiplicar);
    }//Fin vinculaciones

    /**
     * Método que separa la cadena String en dos arrays de números y operadores mediante
     * empresiones regulares. Luego realiza las operaciones mediante un bucle y un switch.
     * @return String(resultadoFinal)
     */
    public String resolverOperacion() {
        String operacion = textView_datos.getText().toString();
//      \\. -> Indica que el punto no es un carácter especial \\W -> Cualquier carácter que no sea una letra
        String expresionNumeros ="(?!\\.)\\W"; //Expresión que recoge los números
        String[] numeros = operacion.split(expresionNumeros);
        String expresionOperadores = "([0-9\\.]+)";//Expresión que recoge los operadores
        String[] operadores = operacion.split(expresionOperadores);
        Float resultado = Float.parseFloat(numeros[0]);
        if(operadores.length!=0) {
            for (int i = 0; i < numeros.length; i++) {
                //Switch con operadores que tenemos en el Array
                switch (operadores[i]) {
                    case "+"://Suma
                        resultado += Float.parseFloat(numeros[i]);
                        break;
                    case "-"://Resta
                        resultado -= Float.parseFloat(numeros[i]);
                        break;
                    case "/"://División
                        resultado /= Float.parseFloat(numeros[i]);
                        break;
                    case "*"://Multiplicación
                        resultado *= Float.parseFloat(numeros[i]);
                        break;
                    case "%"://Resto
                        resultado %= Float.parseFloat(numeros[i]);
                    default:
                        break;
                }
            }
        }
        String resultadoFinal = Float.toString(resultado);
        if(resultadoFinal.equalsIgnoreCase("Infinity") || resultadoFinal.equalsIgnoreCase("NaN") ||
            resultadoFinal.equalsIgnoreCase("-Infinity")) {
            resultadoFinal = "Error";
       }
       //devolvemos el resultado
       return (resultadoFinal);
    }//Fin resolverOperacion

}//Fin MainActivity