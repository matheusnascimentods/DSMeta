import './styles.css';

import Github from '../../assets/img/logo-github.svg';
import Linkedin from '../../assets/img/logo-linkedin.svg';

function Footer() {

    return (

        <>
        
        <footer>

            <div className="container">

                <ul>

                    <li>
                        
                        <a href="https://github.com/matheusnascimentods/DSMeta"><img src={ Github } alt="Github" /></a>
                        
                    </li>
                    
                    <li>
                        
                        <a href="https://www.linkedin.com/in/matheusnascimentods/"><img src={Linkedin} alt="Linkedin" /></a>
                        
                    </li>

                </ul>

                <p>Desenvolvido por Matheus Nascimento dos Santos.</p>

            </div>

        </footer>

        </>

    )
    
}

export default Footer