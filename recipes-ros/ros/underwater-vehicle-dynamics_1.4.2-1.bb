DESCRIPTION = "An underwater dynamics module"
AUTHOR = "Arnau Carrera"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy std-msgs nav-msgs geometry-msgs sensor-msgs tf tf-conversions rospy std-msgs nav-msgs geometry-msgs sensor-msgs tf tf-conversions"

RDEPENDS_${PN} = "rospy std-msgs nav-msgs geometry-msgs sensor-msgs tf tf-conversions"

SRC_URI = "https://github.com/uji-ros-pkg/underwater_simulation-release/archive/release/melodic/underwater_vehicle_dynamics/1.4.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6a8285e8326c7e7809383d12733d9aa5"
SRC_URI[sha256sum] = "e2a65ecc0523bc5ac97b08c1069ebb520fc146d7dd9673b37367362b992ddb7b"

ROS_SPN = "underwater_simulation"
S = "${WORKDIR}/underwater_simulation-release-release-melodic-underwater_vehicle_dynamics-1.4.2-1"

inherit catkin
