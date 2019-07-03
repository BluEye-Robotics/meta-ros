DESCRIPTION = "ROS nodes to publish resized images."
AUTHOR = "Yohei Kakiuchi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge cv-bridge sensor-msgs image-transport std-srvs message-generation nodelet jsk-topic-tools cv-bridge cv-bridge sensor-msgs image-transport std-srvs message-runtime nodelet jsk-topic-tools"

RDEPENDS_${PN} = "cv-bridge cv-bridge sensor-msgs image-transport std-srvs message-runtime nodelet jsk-topic-tools"

SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/melodic/resized_image_transport/1.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c64819b3ddbd67c6b9802d5f3a47d223"
SRC_URI[sha256sum] = "6631d7021aa7bf102ca9be8925ec2fdc5dc4fd4ac4effa126ae8df74bb33232c"

ROS_SPN = "jsk_recognition"
S = "${WORKDIR}/jsk_recognition-release-release-melodic-resized_image_transport-1.2.10-0"

inherit catkin
