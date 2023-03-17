let presets = [];

let example = 0;

let direction = 'row';
let justifyVal = 'flex-start';
let alignVal = 'flex-start';
let wrap = 'nowrap';
let stateSave = {
    direction: 'row',
    wrap: wrap,
    preset: example,
    vals: null
}

/*
 Demo data lives here - modify to suit your needs!
 */

function getPresets() {

    // default
    presets.push({
        blueGrow: 0,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 0,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 0,
        greenShrink: 0,
        greenBasis: 'auto',
        purpleGrow: 0,
        purpleShrink: 0,
        purpleBasis: 'auto',
        description: ''

    });

    // blue grow set to 1 [demonstrates blue filling the space]
    presets.push({
        blueGrow: 1,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 0,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 0,
        greenShrink: 0,
        greenBasis: 'auto',
        purpleGrow: 0,
        purpleShrink: 0,
        purpleBasis: 'auto',
        description: 'Blue grow set to 1.'

    });

    // blue AND green grow set to 1 [demonstrates blue and green filling the space but others not growing]
    presets.push({
        blueGrow: 1,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 0,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 1,
        greenShrink: 0,
        greenBasis: 'auto',
        purpleGrow: 0,
        purpleShrink: 0,
        purpleBasis: 'auto',
        description: 'Blue AND green grow set to 1.'

    });

    // blue set to 1 BUT green grow set to 2 [demos green growing at about twice the rate of blue]
    presets.push({
        blueGrow: 1,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 0,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 2,
        greenShrink: 0,
        greenBasis: 'auto',
        purpleGrow: 0,
        purpleShrink: 0,
        purpleBasis: 'auto',
        description: 'Blue grow set to 1 BUT green grow set to 2.'

    });

    // all have grow of 1 - [fills screen evenly with all cells being the same size ]
    presets.push({
        blueGrow: 1,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 1,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 1,
        greenShrink: 0,
        greenBasis: 'auto',
        purpleGrow: 1,
        purpleShrink: 0,
        purpleBasis: 'auto',
        description: 'All set to grow 1 (fills space evenly).'

    });

    // all grow 1 BUT green has flex basis of 200px [show fullscreen and then shrink to show it maintains its size. after a certain point though some of the green and purple will get cut off ]
    presets.push({
        blueGrow: 1,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 1,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 1,
        greenShrink: 0,
        greenBasis: 600,
        purpleGrow: 1,
        purpleShrink: 0,
        purpleBasis: 'auto',
        description: 'All set to grow 1 BUT green has basis of 600px'

    });

    // all grow 1 BUT green has flex basis of 600px AND shrink of 1 [same as above but shrink of 1 allows green to shrink once there is not enough room to maintain the basis so all fits]
    presets.push({
        blueGrow: 1,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 1,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 1,
        greenShrink: 1,
        greenBasis: 600,
        purpleGrow: 1,
        purpleShrink: 0,
        purpleBasis: 'auto',
        description: 'All set to grow 1 BUT green has basis of 600px AND shrink of 1'

    });

    // all grow 1, green has flex basis of 200px AND shrink of 1, purple has flex basis of 400px and shrink 1 [both try to maintain their basis and shrink evenly]
    presets.push({
        blueGrow: 1,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 1,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 1,
        greenShrink: 1,
        greenBasis: 600,
        purpleGrow: 1,
        purpleShrink: 1,
        purpleBasis: 200,
        description: 'All set to grow 1, green has basis of 600px AND shrink of 1, purple has basis of 200px and shrink of 1'

    });

    // all grow 1, green has flex basis of 200px AND shrink of 1, purple has flex basis of 400px and shrink 1  [both try to maintain their basis but green doesn't shrink so some things get off  ]
    presets.push({
        blueGrow: 1,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 1,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 1,
        greenShrink: 0,
        greenBasis: 600,
        purpleGrow: 1,
        purpleShrink: 1,
        purpleBasis: 200,
        description: 'All set to grow 1, green has basis of 600px AND shrink of 0, purple has basis of 200px and shrink of 1'

    });

    // all grow 1, basis of 200px, AND shrink of 1 EXCEPT red has shrink of 3 [shows red shrinking more]
    presets.push({
        blueGrow: 1,
        blueShrink: 1,
        blueBasis: 200,
        redGrow: 1,
        redShrink: 3,
        redBasis: 200,
        greenGrow: 1,
        greenShrink: 1,
        greenBasis: 200,
        purpleGrow: 1,
        purpleShrink: 1,
        purpleBasis: 200,
        description: 'All set to grow 1, basis of 200px and shrink of 1 EXCEPT red has shrink of 3.'

    });



    // all grow 1, basis of 200px, AND shrink of 1 EXCEPT red has shrink of 3 
    // AND green has basis of 600 BUT shrink of 0 so things get cut off
    presets.push({
        blueGrow: 1,
        blueShrink: 1,
        blueBasis: 200,
        redGrow: 1,
        redShrink: 3,
        redBasis: 200,
        greenGrow: 1,
        greenShrink: 0,
        greenBasis: 600,
        purpleGrow: 1,
        purpleShrink: 1,
        purpleBasis: 200,
        description: 'All set to grow 1, basis of 200px, and shrink of 1 EXCEPT red has shrink of 3 AND green has basis of 600px BUT shrink of 0.'

    });

    // all grow 1, basis of 200px, AND shrink of 1 EXCEPT red has shrink of 3 AND green has basis of 600 [ since green has shrink of 1 it will no longer cause things to get cut off]
    presets.push({
        blueGrow: 1,
        blueShrink: 1,
        blueBasis: 200,
        redGrow: 1,
        redShrink: 3,
        redBasis: 200,
        greenGrow: 1,
        greenShrink: 1,
        greenBasis: 600,
        purpleGrow: 1,
        purpleShrink: 1,
        purpleBasis: 200,
        description: 'All set to grow 1, basis of 200px ,and shrink of 1 EXCEPT red has shrink of 3 AND green has basis of 600px and shrink of 1.'

    });


}

function changeDirection() {
    const dropDown = document.getElementById("flex-dir");
    direction = dropDown.value;
    updateContainer();
}

function updateContainer() {
    const container = document.getElementById("flex-container");
    container.setAttribute("style", `justify-content: ${justifyVal}; align-items: ${alignVal}; flex-direction: ${direction}; flex-wrap: ${wrap}`);
}

function resetContainer() {
    const container = document.getElementById("flex-container");
    container.removeAttribute('style');
}

function resetDirection() {
    const dropDown = document.getElementById("flex-dir");
    direction = 'row';
    dropDown.value = direction;

    const justifyDropDown = document.getElementById("justify-val");
    justifyVal = 'flex-start'
    justifyDropDown.value = justifyVal;

    const alignDropDown = document.getElementById("align-val");
    alignVal = 'flex-start';
    alignDropDown.value = alignVal;


    updateContainer();
}

function updateJustifyVal() {
    const dropDown = document.getElementById("justify-val");
    justifyVal = dropDown.value;
    const container = document.getElementById("flex-container");
    container.setAttribute("style", `justify-content: ${justifyVal}; align-items: ${alignVal}; flex-direction: ${direction};`);

}

function updateAlignVal() {
    const dropDown = document.getElementById("align-val");
    alignVal = dropDown.value;
    const container = document.getElementById("flex-container");
    container.setAttribute("style", `justify-content: ${justifyVal}; align-items: ${alignVal}; flex-direction: ${direction};`);

}


function changeBlueGrow(newVal) {
    let box = document.getElementById("blue-grow");
    box.value = newVal;
};

function getBlueGrowVal() {
    const box = document.getElementById("blue-grow");
    return box.value;
}

function getBlueShrinkVal() {
    const box = document.getElementById("blue-shrink");
    return box.value;
}

function getBlueBasisVal() {
    const box = document.getElementById("blue-basis");
    return getBasisValue(box.value);
}


function getRedGrowVal() {
    const box = document.getElementById("red-grow");
    return box.value;
}

function getRedShrinkVal() {
    const box = document.getElementById("red-shrink");
    return box.value;
}

function getRedBasisVal() {
    const box = document.getElementById("red-basis");
    return getBasisValue(box.value);
}

function getGreenGrowVal() {
    const box = document.getElementById("green-grow");
    return box.value;
}

function getGreenShrinkVal() {
    const box = document.getElementById("green-shrink");
    return box.value;
}

function getGreenBasisVal() {
    const box = document.getElementById("green-basis");
    return getBasisValue(box.value);
}

function getPurpleGrowVal() {
    const box = document.getElementById("purple-grow");
    return box.value;
}

function getPurpleShrinkVal() {
    const box = document.getElementById("purple-shrink");
    return box.value;
}

function getPurpleBasisVal() {
    const box = document.getElementById("purple-basis");
    return getBasisValue(box.value);
}
function updateBlueFlexItem() {
    const basisVal = getBlueBasisVal();
    if (basisVal != null) {
        let item = document.getElementById("item-1");
        let newVal = `flex-grow: ${getBlueGrowVal()}; flex-shrink: ${getBlueShrinkVal()}; flex-basis: ${getBlueBasisVal()}; `;
        item.setAttribute("style", newVal);
        hideDescBox();
    }
}

function updateRedFlexItem() {
    const basisVal = getRedBasisVal();
    if (basisVal != null) {
        let item = document.getElementById("item-2");
        let newVal = `flex-grow: ${getRedGrowVal()}; flex-shrink: ${getRedShrinkVal()}; flex-basis:  ${getRedBasisVal()}; `;
        item.setAttribute("style", newVal);
        hideDescBox();
    }
}

function updateGreenFlexItem() {
    const basisVal = getGreenBasisVal();
    if (basisVal != null) {
        let item = document.getElementById("item-3");
        let newVal = `flex-grow: ${getGreenGrowVal()}; flex-shrink: ${getGreenShrinkVal()}; flex-basis:  ${getGreenBasisVal()}; `;
        item.setAttribute("style", newVal);
        hideDescBox();
    }
}

function updatePurpleFlexItem() {
    const basisVal = getPurpleBasisVal();
    if (basisVal != null) {
        let item = document.getElementById("item-4");
        let newVal = `flex-grow: ${getPurpleGrowVal()}; flex-shrink: ${getPurpleShrinkVal()}; flex-basis:  ${getPurpleBasisVal()}; `;
        item.setAttribute("style", newVal);
        hideDescBox();
    }
}

function checkForBlueEnter(event) {
    if (event.keyCode == 13) {
        updateBlueFlexItem();
    }
}

function checkForRedEnter(event) {
    if (event.keyCode == 13) {
        updateRedFlexItem();
    }
}

function checkForGreenEnter(event) {
    if (event.keyCode == 13) {
        updateGreenFlexItem();
    }
}

function checkForPurpleEnter(event) {
    if (event.keyCode == 13) {
        updatePurpleFlexItem();
    }
}


function getBasisValue(text) {
    if (text == 'auto') {
        return 'auto';
    } else if (isNaN(text)) {
        return null;
    }
    return parseInt(text) + 'px';
}

function updateAll() {
    updateBlueFlexItem();
    updateRedFlexItem();
    updateGreenFlexItem();
    updatePurpleFlexItem();
}

function clearGrowVals() {
    let box = document.getElementById("blue-grow");
    box.value = 0;
    box = document.getElementById("red-grow");
    box.value = 0;
    box = document.getElementById("green-grow");
    box.value = 0;
    box = document.getElementById("purple-grow");
    box.value = 0;
    updateAll();

}

function clearShrinkVals() {
    let box = document.getElementById("blue-shrink");
    box.value = 0;
    box = document.getElementById("red-shrink");
    box.value = 0;
    box = document.getElementById("green-shrink");
    box.value = 0;
    box = document.getElementById("purple-shrink");
    box.value = 0;
    updateAll();

}

function clearBasisVals() {
    let box = document.getElementById("blue-basis");
    box.value = 0;
    box = document.getElementById("red-basis");
    box.value = 0;
    box = document.getElementById("green-basis");
    box.value = 0;
    box = document.getElementById("purple-basis");
    box.value = 0;
    updateAll();

}

function showHideDescBox(hide) {
    const div = document.getElementById('desc-container')
    if (hide) {
        div.classList.add('hide')
    } else {
        div.classList.remove('hide');
    }
}

function hideDescBox() {
    showHideDescBox(true);
}

function showDescBox() {
    showHideDescBox(false);
}


function updateDescription(textVal) {
    let box = document.getElementById("desc-text");
    if (textVal) {
        box.innerText = textVal;
        showDescBox();
    } else {
        box.innerText = '';
        hideDescBox();
    }
}

function handleExampleRadioClick(event) {
    if (event.target.id == 'example-general') {
        doGeneralExamples();
    } else if (event.target.id == 'example-grow-shrink-basis') {
        doGrowShrinkBasisExamples();
    }
}

function setBoxVals(presetData) {
    let box = document.getElementById("blue-grow");
    box.value = presetData.blueGrow;
    box = document.getElementById("blue-shrink");
    box.value = presetData.blueShrink;
    box = document.getElementById("blue-basis");
    box.value = presetData.blueBasis;

    box = document.getElementById("red-grow");
    box.value = presetData.redGrow;
    box = document.getElementById("red-shrink");
    box.value = presetData.redShrink;
    box = document.getElementById("red-basis");
    box.value = presetData.redBasis;

    box = document.getElementById("green-grow");
    box.value = presetData.greenGrow;
    box = document.getElementById("green-shrink");
    box.value = presetData.greenShrink;
    box = document.getElementById("green-basis");
    box.value = presetData.greenBasis;

    box = document.getElementById("purple-grow");
    box.value = presetData.purpleGrow;
    box = document.getElementById("purple-shrink");
    box.value = presetData.purpleShrink;
    box = document.getElementById("purple-basis");
    box.value = presetData.purpleBasis;

    updateAll();
}

function doPreset(presetIndex) {

    if (presetIndex < presets.length) {

        const presetData = presets[presetIndex];

        // let box = document.getElementById("blue-grow");
        // box.value = presetData.blueGrow;
        // box = document.getElementById("blue-shrink");
        // box.value = presetData.blueShrink;
        // box = document.getElementById("blue-basis");
        // box.value = presetData.blueBasis;

        // box = document.getElementById("red-grow");
        // box.value = presetData.redGrow;
        // box = document.getElementById("red-shrink");
        // box.value = presetData.redShrink;
        // box = document.getElementById("red-basis");
        // box.value = presetData.redBasis;

        // box = document.getElementById("green-grow");
        // box.value = presetData.greenGrow;
        // box = document.getElementById("green-shrink");
        // box.value = presetData.greenShrink;
        // box = document.getElementById("green-basis");
        // box.value = presetData.greenBasis;

        // box = document.getElementById("purple-grow");
        // box.value = presetData.purpleGrow;
        // box = document.getElementById("purple-shrink");
        // box.value = presetData.purpleShrink;
        // box = document.getElementById("purple-basis");
        // box.value = presetData.purpleBasis;
        setBoxVals(presetData);

        updateAll();
        updateDescription(presetData.description);
    } else {
        console.log('invalid presetIndex: ' + presetIndex);

    }

}


function getPresets() {

    // default
    presets.push({
        blueGrow: 0,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 0,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 0,
        greenShrink: 0,
        greenBasis: 'auto',
        purpleGrow: 0,
        purpleShrink: 0,
        purpleBasis: 'auto',
        description: ''

    });

    // blue grow set to 1 [demonstrates blue filling the space]
    presets.push({
        blueGrow: 1,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 0,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 0,
        greenShrink: 0,
        greenBasis: 'auto',
        purpleGrow: 0,
        purpleShrink: 0,
        purpleBasis: 'auto',
        description: 'Blue grow set to 1.'

    });

    // blue AND green grow set to 1 [demonstrates blue and green filling the space but others not growing]
    presets.push({
        blueGrow: 1,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 0,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 1,
        greenShrink: 0,
        greenBasis: 'auto',
        purpleGrow: 0,
        purpleShrink: 0,
        purpleBasis: 'auto',
        description: 'Blue AND green grow set to 1.'

    });

    // blue set to 1 BUT green grow set to 2 [demos green growing at about twice the rate of blue]
    presets.push({
        blueGrow: 1,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 0,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 2,
        greenShrink: 0,
        greenBasis: 'auto',
        purpleGrow: 0,
        purpleShrink: 0,
        purpleBasis: 'auto',
        description: 'Blue grow set to 1 BUT green grow set to 2.'

    });

    // all have grow of 1 - [fills screen evenly with all cells being the same size ]
    presets.push({
        blueGrow: 1,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 1,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 1,
        greenShrink: 0,
        greenBasis: 'auto',
        purpleGrow: 1,
        purpleShrink: 0,
        purpleBasis: 'auto',
        description: 'All set to grow 1 (fills space evenly).'

    });

    // all grow 1 BUT green has flex basis of 200px [show fullscreen and then shrink to show it maintains its size. after a certain point though some of the green and purple will get cut off ]
    presets.push({
        blueGrow: 1,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 1,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 1,
        greenShrink: 0,
        greenBasis: 600,
        purpleGrow: 1,
        purpleShrink: 0,
        purpleBasis: 'auto',
        description: 'All set to grow 1 BUT green has basis of 600px'

    });

    // all grow 1 BUT green has flex basis of 600px AND shrink of 1 [same as above but shrink of 1 allows green to shrink once there is not enough room to maintain the basis so all fits]
    presets.push({
        blueGrow: 1,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 1,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 1,
        greenShrink: 1,
        greenBasis: 600,
        purpleGrow: 1,
        purpleShrink: 0,
        purpleBasis: 'auto',
        description: 'All set to grow 1 BUT green has basis of 600px AND shrink of 1'

    });

    // all grow 1, green has flex basis of 200px AND shrink of 1, purple has flex basis of 400px and shrink 1 [both try to maintain their basis and shrink evenly]
    presets.push({
        blueGrow: 1,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 1,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 1,
        greenShrink: 1,
        greenBasis: 600,
        purpleGrow: 1,
        purpleShrink: 1,
        purpleBasis: 200,
        description: 'All set to grow 1, green has basis of 600px AND shrink of 1, purple has basis of 200px and shrink of 1'

    });

    // all grow 1, green has flex basis of 200px AND shrink of 1, purple has flex basis of 400px and shrink 1  [both try to maintain their basis but green doesn't shrink so some things get off  ]
    presets.push({
        blueGrow: 1,
        blueShrink: 0,
        blueBasis: 'auto',
        redGrow: 1,
        redShrink: 0,
        redBasis: 'auto',
        greenGrow: 1,
        greenShrink: 0,
        greenBasis: 600,
        purpleGrow: 1,
        purpleShrink: 1,
        purpleBasis: 200,
        description: 'All set to grow 1, green has basis of 600px AND shrink of 0, purple has basis of 200px and shrink of 1'

    });

    // all grow 1, basis of 200px, AND shrink of 1 EXCEPT red has shrink of 3 [shows red shrinking more]
    presets.push({
        blueGrow: 1,
        blueShrink: 1,
        blueBasis: 200,
        redGrow: 1,
        redShrink: 3,
        redBasis: 200,
        greenGrow: 1,
        greenShrink: 1,
        greenBasis: 200,
        purpleGrow: 1,
        purpleShrink: 1,
        purpleBasis: 200,
        description: 'All set to grow 1, basis of 200px and shrink of 1 EXCEPT red has shrink of 3.'

    });



    // all grow 1, basis of 200px, AND shrink of 1 EXCEPT red has shrink of 3 
    // AND green has basis of 600 BUT shrink of 0 so things get cut off
    presets.push({
        blueGrow: 1,
        blueShrink: 1,
        blueBasis: 200,
        redGrow: 1,
        redShrink: 3,
        redBasis: 200,
        greenGrow: 1,
        greenShrink: 0,
        greenBasis: 600,
        purpleGrow: 1,
        purpleShrink: 1,
        purpleBasis: 200,
        description: 'All set to grow 1, basis of 200px, and shrink of 1 EXCEPT red has shrink of 3 AND green has basis of 600px BUT shrink of 0.'

    });

    // all grow 1, basis of 200px, AND shrink of 1 EXCEPT red has shrink of 3 AND green has basis of 600 [ since green has shrink of 1 it will no longer cause things to get cut off]
    presets.push({
        blueGrow: 1,
        blueShrink: 1,
        blueBasis: 200,
        redGrow: 1,
        redShrink: 3,
        redBasis: 200,
        greenGrow: 1,
        greenShrink: 1,
        greenBasis: 600,
        purpleGrow: 1,
        purpleShrink: 1,
        purpleBasis: 200,
        description: 'All set to grow 1, basis of 200px ,and shrink of 1 EXCEPT red has shrink of 3 AND green has basis of 600px and shrink of 1.'

    });


}

function nextExample() {
    if (example < presets.length - 1) {
        example++;
        doPreset(example);
    }

}

function previousExample() {
    if (example > 0) {
        example--;
        doPreset(example);
    }

}

function currentExample() {
    doPreset(example);

}

function saveVals() {
    const curVals = {
        blueGrow: getBlueGrowVal(),
        blueShrink: getBlueShrinkVal(),
        blueBasis: getBlueBasisVal(),
        redGrow: getRedGrowVal(),
        redShrink: getRedShrinkVal(),
        redBasis: getRedBasisVal(),
        greenGrow: getGreenGrowVal(),
        greenShrink: getGreenShrinkVal(),
        greenBasis: getGreenBasisVal(),
        purpleGrow: getPurpleGrowVal(),
        purpleShrink: getPurpleShrinkVal(),
        purpleBasis: getPurpleBasisVal(),
        description: ''
    }
    saveState.vals = curVals;
}

function saveState() {
    stateSave.wrap = wrap;
    stateSave.direction = direction;
    stateSave.preset = example;
    saveVals();

}

function restoreState() {
    wrap = stateSave.wrap;
    direction = stateSave.direction;
    example = stateSave.preset;
    doPreset(example);
    if (saveState.vals != null) {
        setBoxVals(saveState.vals);
    }
    updateContainer();

}
function doGeneralExamples() {
    saveState();
    wrap = 'nowrap';
    hideInputs();
    doPreset(0);
    resetContainer();
    showGeneral();
}

function doGrowShrinkBasisExamples() {
    // resetDirection();
    hideGeneral();
    showInputs();
    restoreState();
    // example = presetSave;
    // wrap = wrapSave;
    // doPreset(example);
}

function showGeneral() {
    const div = document.getElementById('general-section');
    div.classList.remove('hide')
}

function hideGeneral() {
    const div = document.getElementById('general-section');
    div.classList.add('hide')
}

function showInputs() {
    const div = document.getElementById('grow-shrink-basis-section');
    div.classList.remove('hide')
}

function hideInputs() {
    const div = document.getElementById('grow-shrink-basis-section');
    div.classList.add('hide')
}


document.addEventListener('DOMContentLoaded', () => {

    const generalRadioBtn = document.getElementById('example-general');
    generalRadioBtn.addEventListener('click', evt => handleExampleRadioClick(evt));

    const growShrinkBasisRadioBtn = document.getElementById('example-grow-shrink-basis');
    growShrinkBasisRadioBtn.addEventListener('click', evt => handleExampleRadioClick(evt));

    const dirSelect = document.getElementById('flex-dir');
    dirSelect.addEventListener('change', () => changeDirection());

    const justifyValSelect = document.getElementById('justify-val');
    justifyValSelect.addEventListener('change', () => updateJustifyVal());

    const alignValSelect = document.getElementById('align-val');
    alignValSelect.addEventListener('change', () => updateAlignVal());

    const blueInputs = document.querySelectorAll('#blue-grow, #blue-shrink, #blue-basis');
    blueInputs.forEach(box => {
        box.addEventListener('blur', () => updateBlueFlexItem());
        box.addEventListener('keyup', (evt) => checkForBlueEnter(evt))
    });

    const redInputs = document.querySelectorAll('#red-grow, #red-shrink, #red-basis');
    redInputs.forEach(box => {
        box.addEventListener('blur', () => updateRedFlexItem());
        box.addEventListener('keyup', (evt) => checkForRedEnter(evt))
    });

    const greenInputs = document.querySelectorAll('#green-grow, #green-shrink, #green-basis');
    greenInputs.forEach(box => {
        box.addEventListener('blur', () => updateGreenFlexItem());
        box.addEventListener('keyup', (evt) => checkForGreenEnter(evt))
    });

    const purpleInputs = document.querySelectorAll('#purple-grow, #purple-shrink, #purple-basis');
    purpleInputs.forEach(box => {
        box.addEventListener('blur', () => updatePurpleFlexItem());
        box.addEventListener('keyup', (evt) => checkForPurpleEnter(evt))
    });

    const clearGrowsBtn = document.getElementById('clear-grows');
    clearGrowsBtn.addEventListener('click', () => clearGrowVals());

    const clearShrinksBtn = document.getElementById('clear-shrinks');
    clearShrinksBtn.addEventListener('click', () => clearShrinkVals());

    const clearBasisBtn = document.getElementById('clear-basis');
    clearBasisBtn.addEventListener('click', () => clearBasisVals());

    const nextExampleBtn = document.getElementById('next-example');
    nextExampleBtn.addEventListener('click', () => nextExample());

    const prevExampleBtn = document.getElementById('previous-example');
    prevExampleBtn.addEventListener('click', () => previousExample());

    const currentExampleBtn = document.getElementById('current-example');
    currentExampleBtn.addEventListener('click', () => currentExample());

    const wrapSelect = document.getElementById('wrap-val');
    wrapSelect.addEventListener('change', (evt) => {
        const val = evt.target.value;
        wrap = val;
        updateContainer();
    })

    getPresets();
    doPreset(example);
});