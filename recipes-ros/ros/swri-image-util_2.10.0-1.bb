DESCRIPTION = "swri_image_util"
AUTHOR = "Kris Kozak"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "swri-nodelet camera-calibration-parsers cv-bridge libeigen geometry-msgs image-geometry image-transport message-filters nav-msgs nodelet roscpp rospy std-msgs swri-geometry-util swri-math-util swri-opencv-util swri-roscpp tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_image_util/2.10.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a7558d8fb5c0547e5117e7ee314558c6"
SRC_URI[sha256sum] = "d2b63c1130fc9bc87a1a42dfaf98447907b79151ddefa5c30d9c2e7644b2fa6c"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_image_util-2.10.0-1"

inherit catkin
