DESCRIPTION = "Compressed_image_transport provides a plugin to image_transport for transparently sending images encoded as JPEG or PNG."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge dynamic-reconfigure image-transport cv-bridge dynamic-reconfigure image-transport"

RDEPENDS_${PN} = "cv-bridge dynamic-reconfigure image-transport"

SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/melodic/compressed_image_transport/1.9.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6230f1abce1ec13c95faa69311d1373d"
SRC_URI[sha256sum] = "b3f07ada5ec4f1e8335c95ded17dc75ba399b98d21c1a043fde96c3f974ba64d"

ROS_SPN = "image_transport_plugins"
S = "${WORKDIR}/image_transport_plugins-release-release-melodic-compressed_image_transport-1.9.5-0"

inherit catkin
