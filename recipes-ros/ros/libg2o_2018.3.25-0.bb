DESCRIPTION = "The libg2o library from http://openslam. org/g2o. html"
AUTHOR = "Rainer Kuemmerle"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost libeigen  suitesparse catkin boost libeigen  suitesparse"

RDEPENDS_${PN} = "catkin boost libeigen  suitesparse"

SRC_URI = "https://github.com/ros-gbp/libg2o-release/archive/release/melodic/libg2o/2018.3.25-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a49dd32356f0b4b30080d16757089fe2"
SRC_URI[sha256sum] = "b904a96dd4edffa57b21856d75d7d0bf9b064921e330012922c67a545ee54f6a"

S = "${WORKDIR}/libg2o-release-release-melodic-libg2o-2018.3.25-0"

inherit catkin
