import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';
import templates from './DDLImagesView.soy';
import ImageListComponent from './ImageListComponent.es';

import core from 'metal/src/core';
import dom from 'metal-dom/src/dom';

class DDLImagesView extends Component {

    constructor(opt_config) {
        super(opt_config);
        console.log("constructor DDLImagesView");
    }

    /**
     * @inheritDoc
     */
    attached() {
        console.log('attached DDLImagesView');
    }



    myClickFunction() {
        this.counter = ++this.counter;
        console.log('Click!!!');
    }
}

// Register component
Soy.register(DDLImagesView, templates);

DDLImagesView.STATE = {
    counter: {
        // The default value will be: `This is my default STATE value, yeah`.
        value: 0
    }
}

export default DDLImagesView;