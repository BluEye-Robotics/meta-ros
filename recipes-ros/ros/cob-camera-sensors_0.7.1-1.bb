DESCRIPTION = "For more information read the readme. htm file located in"
AUTHOR = "Jan Fischer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation boost cmake-modules cob-vision-utils cv-bridge image-transport opencv message-filters polled-camera roscpp sensor-msgs libtinyxml"

RDEPENDS_${PN} = "message-runtime rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_camera_sensors/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d3f8edfa6f876c73cb3bd91ce2aafccc"
SRC_URI[sha256sum] = "7ae05f21b502d10908242fefcb1e77e173b1bb9c9edef04acf9c2f4ccc6d37cb"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_camera_sensors-0.7.1-1"

inherit catkin
