import React, { useState } from "react";
import BalaImg from "./assets/arquivos de imagem/Branca.png";
import Bala from "./components/bala";

const App = () => {
  const [bala, alteraBala] = useState(0);
  const [branca, alteraBranca] = useState(0);
  const [invertida, alteraInvertida] = useState(false);

  const inverter = () => {
    invertida === true ? "" : alteraInvertida(true);
  };
  const desInverter = () => {
    invertida === true ? alteraInvertida(false) : "";
  };

  const maisBala = () => {
    desInverter();
    alteraBala(bala + 1);
  };
  const menosBala = () => {
    if (invertida) {
      desInverter();
      alteraBranca(branca - 1);
    } else {
      alteraBala(bala - 1);
    }
  };
  const maisBranca = () => {
    alteraBranca(branca + 1);
  };
  const menosBranca = () => {
    if (invertida) {
      desInverter();
      alteraBala(bala - 1);
    } else {
      alteraBranca(branca - 1);
    }
  };

  console.log(invertida);

  return (
    <>
      <div className="header">
        <div className="header--balas">
          <button className="balaNormalButton" onClick={maisBala}>
            Bala
          </button>
          <button className="balaBrancaButton" onClick={maisBranca}>
            Branca
          </button>
        </div>
        {branca > 0 && bala > 0 ? (
          <button
            className="balaBrancaButton"
            onClick={inverter}
            style={
              invertida
                ? { backgroundColor: "green" }
                : { backgroundColor: "white", color: "black" }
            }
          >
            Invertida
          </button>
        ) : (
          ""
        )}
      </div>
      <div className="camara">
        {Array(bala)
          .fill()
          .map((currentItem, index) => (
            <Bala
              menosBala={menosBala}
              menosBranca={menosBranca}
              verdadeira={1}
              key={"bala" + index}
            />
          ))}

        {Array(branca)
          .fill()
          .map((currentItem, index) => (
            <Bala
              menosBala={menosBala}
              menosBranca={menosBranca}
              key={"bala" + index}
              verdadeira={0}
            />
          ))}
      </div>
    </>
  );
};

export default App;
