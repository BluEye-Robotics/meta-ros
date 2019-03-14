DESCRIPTION = "Messages for interfacing with various computer vision pipelines, such as object detectors."
AUTHOR = "Adam Allevato"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "message-generation message-runtime std-msgs sensor-msgs geometry-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/Kukanani/vision_msgs-release/archive/release/melodic/vision_msgs/0.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a278f89fb62599486635f366fbb3a1ec"
SRC_URI[sha256sum] = "aea7d0a539a76bbd0072f74bb3c7ebc0a7f3b3277963f8d696de42a5c4066e90"

S = "${WORKDIR}/vision_msgs-release-release-melodic-vision_msgs-0.0.1-0"

inherit catkin
