package rocks.process.digient.domain;

import org.springframework.core.style.ToStringCreator;

public class Application {

    private String aId;
    private String cId;
    private String aDate;
    private String productId;
    private String carId;
    private Integer age;
    private Integer kw;
    private Boolean licenseRevocation;
    private Integer carPrice;
    private String status;
    private String decision;
    private String risk;
    private Integer retention;

    public Application() {
    }

    public Application(String aId, String cId, String aDate, String productId, String carId, Integer age, Integer kw, Boolean licenseRevocation, Integer carPrice, String status, String decision, String risk, Integer retention) {
        super();
        this.aId = aId;
        this.cId = cId;
        this.aDate = aDate;
        this.productId = productId;
        this.carId = carId;
        this.age = age;
        this.kw = kw;
        this.licenseRevocation = licenseRevocation;
        this.carPrice = carPrice;
        this.status = status;
        this.decision = decision;
        this.risk = risk;
        this.retention = retention;
    }

    public String getAId() {
        return aId;
    }

    public void setAId(String aId) {
        this.aId = aId;
    }

    public String getCId() {
        return cId;
    }

    public void setCId(String cId) {
        this.cId = cId;
    }

    public String getADate() {
        return aDate;
    }

    public void setADate(String aDate) {
        this.aDate = aDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getKw() {
        return kw;
    }

    public void setKw(Integer kw) {
        this.kw = kw;
    }

    public Boolean getLicenseRevocation() {
        return licenseRevocation;
    }

    public void setLicenseRevocation(Boolean licenseRevocation) {
        this.licenseRevocation = licenseRevocation;
    }

    public Integer getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Integer carPrice) {
        this.carPrice = carPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public Integer getRetention() {
        return retention;
    }

    public void setRetention(Integer retention) {
        this.retention = retention;
    }

    @Override
    public String toString() {
        return new ToStringCreator(this).append("aId", aId).append("cId", cId).append("aDate", aDate).append("productId", productId).append("carId", carId).append("age", age).append("kw", kw).append("licenseRevocation", licenseRevocation).append("carPrice", carPrice).append("status", status).append("decision", decision).append("risk", risk).append("retention", retention).toString();
    }

}