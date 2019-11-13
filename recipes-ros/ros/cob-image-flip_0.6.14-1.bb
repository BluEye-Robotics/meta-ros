DESCRIPTION = "Flips the image of Care-O-bots kinect in dependence of the viewing direction of the cameras to receive an upright image all the time."
AUTHOR = "Richard Bormann"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "boost cob-perception-msgs cv-bridge geometry-msgs image-transport opencv nodelet pcl-conversions pcl-ros pluginlib roscpp sensor-msgs stereo-msgs tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/melodic/cob_image_flip/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "80c4205c6f02a6d73a916791f6738c79"
SRC_URI[sha256sum] = "a75ea8e5dfca1653e7b14e9df4be8714858decb9898bc20059a68b85eadf8cc0"

ROS_SPN = "cob_perception_common"
S = "${WORKDIR}/cob_perception_common-release-release-melodic-cob_image_flip-0.6.14-1"

inherit catkin
