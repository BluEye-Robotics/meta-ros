DESCRIPTION = "image_transport should always be used to subscribe to and publish images. It provides transparent support for transporting images in low-bandwidth compressed formats. Examples (provided by separate plugin packages) include JPEG/PNG compression and Theora streaming video."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-filters pluginlib rosconsole roscpp roslib sensor-msgs message-filters pluginlib rosconsole roscpp roslib sensor-msgs"

RDEPENDS_${PN} = "message-filters pluginlib rosconsole roscpp roslib sensor-msgs"

SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/melodic/image_transport/1.11.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2035824dcdb07482cf2c65137d32c2b4"
SRC_URI[sha256sum] = "070c49d03d5320c322237672d62c34b3fd3f8c4b311a76f3572894f368421d55"

ROS_SPN = "image_common"
S = "${WORKDIR}/image_common-release-release-melodic-image_transport-1.11.13-0"

inherit catkin
