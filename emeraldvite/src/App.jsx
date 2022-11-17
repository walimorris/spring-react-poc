import {useEffect, useState} from 'react'
import './App.css'


const List = ({uniqueKey, positions}) => {
    return (
        <ul id={uniqueKey}>
            {positions.map((position, index) => <li key={index}>{position}</li>)}
        </ul>
    )
}

const App = () => {
    const [positionsList, setPositionsList] = useState([]);
    const [positionsListKey, setPositionsListKey] = useState('');

    useEffect( () => {
        fetch('http://localhost:8081/api/test/positions')
            .then(response => response.json())
            .then(data => {
                setPositionsList(data.positions);
                setPositionsListKey(data.id);
            })
    },[]);

    return (
        <div>
            <List uniqueKey={positionsListKey} positions={positionsList}/>
        </div>
    )
}

export default App
