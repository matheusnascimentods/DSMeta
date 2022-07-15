import NotificationButton from '../NotificationButton'

import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";

import './styles.css'
import { useState } from 'react';

function SalesCard() {

    const [minDate, setMinDate] = useState(new Date());
    const [maxDate , setMaxDate]= useState(new Date());
 
    return (  
    
        <>
        
        <div className="dsmeta-card">

            <h2 className="dsmeta-sales-title">Tabela de vendas</h2>

            <div>

                <div className="dsmeta-form-control-container">

                    <DatePicker
                        selected={minDate}
                        onChange={(date: Date) => setMinDate(date)}
                        className="dsmeta-form-control"
                        dateFormat="dd/MM/yyyy"
                    />

                </div>

                <div className="dsmeta-form-control-container">

                     <DatePicker
                        selected={maxDate}
                        onChange={(date: Date) => setMaxDate(date)}
                        className="dsmeta-form-control"
                        dateFormat="dd/MM/yyyy"
                    />

                </div>

            </div>

            <div>

                <table className="dsmeta-sales-table">

                    <thead>

                        <tr>

                            <th className="show992">ID</th>
                            <th>Vendedor</th>
                            <th className="show576">Data</th>
                            <th className="show992">Visitas</th>
                            <th className="show992">Vendas</th>
                            <th>Total</th>
                            <th>Notificar</th>

                        </tr>

                    </thead>

                    <tbody>

                        <tr>
                            <td className="show992">03</td>
                            <td>Anakin</td>
                            <td className="show576">01/10/2006</td>
                            <td className="show992">10</td>
                            <td className="show992">80</td>
                            <td>R$ 40.000,00</td>
                            <td>
                                <NotificationButton />
                            </td>

                        </tr>
            
                    </tbody>
    
                </table>

            </div>

        </div>

        </>
    
    )
}

export default SalesCard
