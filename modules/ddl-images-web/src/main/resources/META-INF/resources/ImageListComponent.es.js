import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';

import core from 'metal/src/core';
import dom from 'metal-dom/src/dom';

import componentTemplates from './ImageListComponent.soy';

/**
 * ImageListComponent
 */
class ImageListComponent extends Component {

    /**
     * Reload the images, filtered by keyword
     * In first step, the key word is fix in code
     * TODO Input field for keyword
     *
     * @protected
     */
    searchImages(event) {
        console.log('searchImages');
        return Liferay.Service(
            '/ims.image/find-file-entries',
            {
                keyword: 'P1040827.jpg'
            },
            function(obj) {
                console.log(obj);
            }
        ).then(response => {
            this.images = response;
        });
    }

    /**
     * @inheritDoc
     */
    attached() {
        console.log('Attached ImageListController');
    }

    /**
     * @inheritDoc
     */
    rendered() {
    }


}

/**
 * State definition.
 * @type {!Object}
 * @static
 */
ImageListComponent.STATE = {
    /**
     * Images to show
     * @type {(Array<!Object>)}
     */
    images: {
        value: []
    }
};

// Register component
Soy.register(ImageListComponent, componentTemplates);

export default ImageListComponent;