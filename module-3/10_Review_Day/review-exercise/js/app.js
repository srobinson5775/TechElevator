const PROBLEM_PER_SET = 10;
let problemSet = [];
let currentProblem = 1;
let score = 0;

/**
 * Generates a problem set with {PROBLEMS_PER_SET} problems
 * 
 */

function generateProblemSet() {
    for(i = 0; i < PROBLEM_PER_SET; ++i) {
        const problem = {
            left: getRandomNumber(10),
            right: getRandomNumber(10),
            answer: null
        }
        const correctAnswer = problem.left * problem.right;
        problem.answer = correctAnswer;
        const answers = shuffleArray([correctAnswer, getRandomNumber(82),getRandomNumber(82), getRandomNumber(82)]);
        problemSet.push({problem, answers});

    }
}

/**
 * Handles display the current problem set
 * The expression & answers are both empty by default
 */

function displayProblem() {
    displayProblem();
    displayAnswers();
}

/**
 * Sets the current problem (problemStatement) based on the currentProblem
 * 
 */

function displayProblem(){
    const problemContainer = document.getElementById('problem');
    const problemStatement = `${problemSet[currentProblem-1].problem.left} * ${problemSet[currentProblem-1].problem.right}`;
    problemContainer.querySelector('div.expression').innerText = problemStatement;
}

/**
 * Displays the 4 possible answers for the current problem
 */
function displayAnswers(){
    const answerContainer = document.getElementById('answers');
    const list = answerContainer.querySelector('ul');
    const listItems = list.querySelector('li');
    const answers = problemSet[currentProblem -1].answers;

    for(let i = 0; i < answers.length; i++) {
        listItems[i].innerText = answers[i];
    }
}

/**
 * Utility function to generate a random number based on max
 * @param {number} max
 */
function getRandomNumber(max) {
    return Math.floor(Math.random() * Math.floor(max));
}

function createProblem();



function nextProblem();

function startNewProblemSet() {
    
}

//make an answer container
//query selector for ul
