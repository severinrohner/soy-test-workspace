import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';
import templates from './View.soy';
import ImageListComponent from './ImageListComponent.es';

import core from 'metal/src/core';
import dom from 'metal-dom/src/dom';

class View extends Component {

    constructor(opt_config) {
        super(opt_config);
        console.log("constructor View");
    }

    /**
     * @inheritDoc
     */
    attached() {
        console.log('attached View');
    }



    myClickFunction() {
        this.counter = ++this.counter;
        console.log('Click!!!');
    }
}

// Register component
Soy.register(View, templates);

View.STATE = {
    counter: {
        // The default value will be: `This is my default STATE value, yeah`.
        value: 0
    }
}

export default View;