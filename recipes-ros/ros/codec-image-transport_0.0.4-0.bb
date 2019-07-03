DESCRIPTION = "The codec_image_transport package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "image-transport ffmpeg pluginlib roscpp sensor-msgs image-transport ffmpeg pluginlib roscpp sensor-msgs"

RDEPENDS_${PN} = "image-transport ffmpeg pluginlib roscpp sensor-msgs"

SRC_URI = "https://github.com/yoshito-n-students/codec_image_transport-release/archive/release/melodic/codec_image_transport/0.0.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0f623c079ea2f01b85ddcd7fda5ddd43"
SRC_URI[sha256sum] = "13bb8181da621d6d7bff7f97900b2bc744a93a4e2c8f5e92030a3e50da2a578c"

S = "${WORKDIR}/codec_image_transport-release-release-melodic-codec_image_transport-0.0.4-0"

inherit catkin
