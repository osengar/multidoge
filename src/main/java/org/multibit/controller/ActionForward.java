package org.multibit.controller;

/**
 * an enum encapsulating the ActionForwards 
 * these are used (mainly in Actions) to point to the next logical View to display
 * @author jim
 *
 */
public enum ActionForward {
    FORWARD_TO_SAME,
    FORWARD_TO_PREVIOUS,
    FORWARD_TO_TRANSACTIONS,
    FORWARD_TO_SEND_BITCOIN,
    FORWARD_TO_SEND_BITCOIN_CONFIRM,
    FORWARD_TO_RECEIVE_BITCOIN,
    FORWARD_TO_HELP_CONTENTS,
    FORWARD_TO_HELP_ABOUT,
    FORWARD_TO_PREFERENCES,
    FORWARD_TO_OPEN_WALLET,
    FORWARD_TO_CREATE_NEW_WALLET,
    FORWARD_TO_VALIDATION_ERROR,
    FORWARD_TO_YOUR_WALLETS,
    FORWARD_TO_CREATE_BULK_ADDRESSES_VIEW,
    FORWARD_TO_RESET_TRANSACTIONS_VIEW,
    FORWARD_TO_SHOW_OPEN_URI_VIEW
}
