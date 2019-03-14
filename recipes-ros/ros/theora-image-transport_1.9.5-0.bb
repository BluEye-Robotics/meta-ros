DESCRIPTION = "Theora_image_transport provides a plugin to image_transport for transparently sending an image stream encoded with the Theora codec."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge dynamic-reconfigure image-transport libogg libtheora message-generation pluginlib rosbag std-msgs cv-bridge dynamic-reconfigure image-transport libogg libtheora message-runtime pluginlib rosbag std-msgs"

RDEPENDS_${PN} = "cv-bridge dynamic-reconfigure image-transport libogg libtheora message-runtime pluginlib rosbag std-msgs"

SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/melodic/theora_image_transport/1.9.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ac5183cb0b66ec99a9f9541dceb05bf7"
SRC_URI[sha256sum] = "03701fa45f64b4642eb8b7720662363bb10c4f20e32da2783c595258fc3eaced"

ROS_SPN = "image_transport_plugins"
S = "${WORKDIR}/image_transport_plugins-release-release-melodic-theora_image_transport-1.9.5-0"

inherit catkin
