package ru.netology.domain.attachment;

public class Poll {
    private int id;
    private int ownerId;
    private int created;
    private String question;
    private int votes;
    private boolean anonymous;
    private boolean multiple;
    private int endDate;
    private boolean isBoard;
    private boolean canEdit;
    private boolean canVote;
    private boolean canReport;
    private boolean canShare;
    private int authorId;
    private Photo photo;
    private Background background;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }

    public boolean isMultiple() {
        return multiple;
    }

    public void setMultiple(boolean multiple) {
        this.multiple = multiple;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public boolean isBoard() {
        return isBoard;
    }

    public void setBoard(boolean board) {
        isBoard = board;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanVote() {
        return canVote;
    }

    public void setCanVote(boolean canVote) {
        this.canVote = canVote;
    }

    public boolean isCanReport() {
        return canReport;
    }

    public void setCanReport(boolean canReport) {
        this.canReport = canReport;
    }

    public boolean isCanShare() {
        return canShare;
    }

    public void setCanShare(boolean canShare) {
        this.canShare = canShare;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }
}
