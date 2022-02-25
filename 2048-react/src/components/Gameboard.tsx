import React, { FC } from "react";
import GameboardCell from "./GameboardCell";

import "../styles/Gameboard.scss";

interface GameboardProps {
  width: number;
  height: number;
}

const Gameboard: FC<GameboardProps> = ({ width, height }) => {
  return <div className="gameboard">{renderGrid(width, height)}</div>;
};

const renderGrid = (width: number, height: number) => {
  return Array.from(Array(height).keys()).map((row) => {
    return (
      <div key={row} className="gameboard-row">
        {Array.from(Array(width).keys()).map((col) => {
          return <GameboardCell key={col}></GameboardCell>;
        })}
      </div>
    );
  });
};

export default Gameboard;
