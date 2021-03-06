import React from 'react'
import LeftSideBar from "../containers/left-side-bar"
import RightSideBar from "./Right-Side-Bar"
import NewAppPopup from './popups/NewAppPopup'

export default class MainBottomView extends React.Component {

    render() {
        return (
         <div className="main-bottom-view">
         <LeftSideBar/>
         <NewAppPopup/> 
         <RightSideBar/>
         </div> 
        )
      }
    }