DESCRIPTION = "Package with launch files for demonstrations with the Desistek SAGA ROV underwater vehicle"
AUTHOR = "Emre Ege"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "desistek-saga-description desistek-saga-control"

SRC_URI = "https://github.com/uuvsimulator/desistek_saga-release/archive/release/melodic/desistek_saga_gazebo/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c5b9c7d6d2afd7a198d2c977434e0896"
SRC_URI[sha256sum] = "534d7e4e5fb0ab7d099d6e20561f3ac9275f98a06e13e59ca92b1b0114fb2911"

ROS_SPN = "desistek_saga"
S = "${WORKDIR}/desistek_saga-release-release-melodic-desistek_saga_gazebo-0.3.2-0"

inherit catkin
