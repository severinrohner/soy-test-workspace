import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';
import templates from './View.soy';

import core from 'metal/src/core';
import dom from 'metal-dom/src/dom';

class View extends Component {

    constructor(opt_config) {
        super(opt_config);
        console.log("constructor");
        this.gaVersion = 3;
        this.minorVersion = 2;
    }

    /**
     * @inheritDoc
     */
    attached() {
        console.log('attached');
    }



    myClickFunction() {
        let releaseInfo = this.releaseInfo.replace("7.0.".concat(this.minorVersion.toString()),
            "7.0.".concat((++this.minorVersion).toString()));
        releaseInfo = releaseInfo.replace("GA".concat(this.gaVersion).toString(),
            "GA".concat((++this.gaVersion).toString()));
        this.releaseInfo = releaseInfo;
        console.log('Click!!!');
    }
}

// Register component
Soy.register(View, templates);

View.STATE = {
    releaseInfo: {
        // The default value will be: `This is my default STATE value, yeah`.
        value: 0
    }
}

export default View;