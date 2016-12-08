import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';
import templates from './View.soy';

class View extends Component {
    constructor(opt_config) {
        console.log("constructor");
        super(opt_config);
    }

    /**
     * @inheritDoc
     */
    attached() {
        console.log('attached');
    }

    myClickFunction() {
        alert('Jipi');
    }
}

// Register component
Soy.register(View, templates);

View.STATE = {
    releaseInfo: {
        // The default value will be: `This is my default STATE value, yeah`.
        value: 'This is my default STATE value, yeah'
    }
}

export default View;