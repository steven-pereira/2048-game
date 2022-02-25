import React, { FC } from "react";

import "../styles/GameboardCell.scss";

interface GameboardCellProps {}

const GameboardCell: FC<GameboardCellProps> = () => {
  return <div className="gameboard-cell"></div>;
};

export default GameboardCell;
