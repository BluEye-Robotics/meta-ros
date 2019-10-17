DESCRIPTION = "Leg Detector using a machine learning approach to find leg-like patterns of laser scanner readings."
AUTHOR = "Caroline Pantofaru"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bfl dynamic-reconfigure geometry-msgs image-geometry laser-geometry message-filters people-msgs people-tracking-filter roscpp sensor-msgs std-msgs std-srvs tf visualization-msgs"

RDEPENDS_${PN} = "laser-filters map-laser"

SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/melodic/leg_detector/1.1.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7fc4444f3c7bc4fe1c20caa4d63031b8"
SRC_URI[sha256sum] = "e1865c4b5c768ff408d3d1cb531bf26dd6acac28f2a7ad5d25fe11cf6ed85bb8"

ROS_SPN = "people"
S = "${WORKDIR}/people-release-release-melodic-leg_detector-1.1.2-0"

inherit catkin
