DESCRIPTION = "swri_image_util"
AUTHOR = "Kris Kozak"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "swri-nodelet camera-calibration-parsers cv-bridge libeigen geometry-msgs image-geometry image-transport message-filters nav-msgs nodelet roscpp rospy std-msgs swri-geometry-util swri-math-util swri-opencv-util swri-roscpp tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_image_util/2.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "52d64b3c4133cca20502c65da4a4a422"
SRC_URI[sha256sum] = "3a7e532504ecfbeb15fbbb88f5dfb42f8d63a8fe946cbf7aa339a3d52f257653"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_image_util-2.8.0-0"

inherit catkin
