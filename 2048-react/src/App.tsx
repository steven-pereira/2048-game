import React from "react";
import Gameboard from "./components/Gameboard";

import "./styles/App.scss";

function App() {
  return (
    <div className="container">
      <div className="header">
        <h1 className="title">2048</h1>
      </div>
      <div className="game-container">
        <Gameboard width={4} height={4}></Gameboard>
      </div>
    </div>
  );
}

export default App;
