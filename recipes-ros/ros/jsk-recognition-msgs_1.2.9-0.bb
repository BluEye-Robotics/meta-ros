DESCRIPTION = "ROS messages for jsk_pcl_ros and jsk_perception."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pcl-msgs std-msgs geometry-msgs sensor-msgs message-generation jsk-footstep-msgs pcl-msgs std-msgs geometry-msgs sensor-msgs message-generation jsk-footstep-msgs"

RDEPENDS_${PN} = "pcl-msgs std-msgs geometry-msgs sensor-msgs message-generation jsk-footstep-msgs"

SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/melodic/jsk_recognition_msgs/1.2.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "080d2bb01a3a52da48cb8e7cf5b3ef1d"
SRC_URI[sha256sum] = "2bf7fd2c7608709b0f5670d49e201d672b7ed85ccce7c0078c5dce53aa07ecfa"

ROS_SPN = "jsk_recognition"
S = "${WORKDIR}/jsk_recognition-release-release-melodic-jsk_recognition_msgs-1.2.9-0"

inherit catkin
