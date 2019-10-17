DESCRIPTION = "swri_image_util"
AUTHOR = "Kris Kozak"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "swri-nodelet camera-calibration-parsers cv-bridge libeigen geometry-msgs image-geometry image-transport message-filters nav-msgs nodelet roscpp rospy std-msgs swri-geometry-util swri-math-util swri-opencv-util swri-roscpp tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_image_util/2.9.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1101993abd98101c756e007907a2d02f"
SRC_URI[sha256sum] = "99128d9b1d275f8745408336b22f2b6c028acda4f0f650f78c0d9d0081b17424"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_image_util-2.9.0-1"

inherit catkin
