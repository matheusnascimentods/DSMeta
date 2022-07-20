import axios from 'axios';
import { toast } from 'react-toastify';
import icon from "../../assets/img/bell.svg";
import { BASE_URL } from '../../utils/request';
import './styles.css'

type Props = {

    saleID: number;

}

function sendSMS(id:number) {

    axios.get(`${BASE_URL}/Sales/${id}/Notification`)
        .then((response) => { 
            
            console.log(response);
            toast.info("SMS enviado com sucesso") 
        
        });
    
}

function NotificationButton( { saleID } : Props) {
 
    return (  
    
        <div className="dsmeta-red-btn-container" onClick={() => sendSMS(saleID)}>

            <div className="dsmeta-red-btn"><img src={icon} alt="Notificar"/></div>

        </div>
    
    )
}

export default NotificationButton
