DESCRIPTION = "ROS package for LDS(HLS-LFCD2). The LDS (Laser Distance Sensor) is a sensor sending the data to Host for the simultaneous localization and mapping (SLAM). Simultaneously the detecting obstacle data can also be sent to Host. HLDS(Hitachi-LG Data Storage) is developing the technology for the moving platform sensor such as Robot Vacuum Cleaners, Home Robot, Robotics Lawn Mower Sensor, etc."
AUTHOR = "Pyo"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs sensor-msgs boost"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/hls-lfcd-lds-driver-release/archive/release/melodic/hls_lfcd_lds_driver/1.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "be5662447de1aad48debc12863c1e2f4"
SRC_URI[sha256sum] = "d748e0b392248e2d2c64695d95a7ac37fe884a0f0c999e2e0c8e69931efeda89"

ROS_SPN = "hls-lfcd-lds-driver"
S = "${WORKDIR}/hls-lfcd-lds-driver-release-release-melodic-hls_lfcd_lds_driver-1.1.0-1"

inherit catkin
