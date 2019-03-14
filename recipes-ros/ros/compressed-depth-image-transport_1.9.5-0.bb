DESCRIPTION = "Compressed_depth_image_transport provides a plugin to image_transport for transparently sending depth images (raw, floating-point) using PNG compression."
AUTHOR = "Julius Kammerl"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge dynamic-reconfigure image-transport cv-bridge dynamic-reconfigure image-transport"

RDEPENDS_${PN} = "cv-bridge dynamic-reconfigure image-transport"

SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/melodic/compressed_depth_image_transport/1.9.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a2f0d95d183a79568d1d9d5ee26fa631"
SRC_URI[sha256sum] = "344ba8616aae571668169db0759f432c049e9f2c272dbcbb2a82371ff285c212"

ROS_SPN = "image_transport_plugins"
S = "${WORKDIR}/image_transport_plugins-release-release-melodic-compressed_depth_image_transport-1.9.5-0"

inherit catkin
