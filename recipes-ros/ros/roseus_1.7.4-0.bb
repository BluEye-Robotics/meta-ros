DESCRIPTION = "EusLisp client for ROS Robot Operating System."
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geneus rosbash roslang roscpp rosnode rospack rostest rosmsg rostopic euslisp jskeus actionlib actionlib-msgs angles visualization-msgs tf tf2-ros geometry-msgs mk rosbuild std-msgs std-srvs sensor-msgs visualization-msgs message-generation dynamic-reconfigure actionlib-tutorials coreutils geneus rosbash roslang roscpp rosnode rospack rostest rosmsg euslisp jskeus actionlib actionlib-msgs visualization-msgs tf tf2-ros geometry-msgs std-msgs std-srvs sensor-msgs visualization-msgs message-runtime dynamic-reconfigure actionlib-tutorials"

RDEPENDS_${PN} = "geneus rosbash roslang roscpp rosnode rospack rostest rosmsg euslisp jskeus actionlib actionlib-msgs visualization-msgs tf tf2-ros geometry-msgs std-msgs std-srvs sensor-msgs visualization-msgs message-runtime dynamic-reconfigure actionlib-tutorials"

SRC_URI = "https://github.com/tork-a/jsk_roseus-release/archive/release/melodic/roseus/1.7.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "73377eb7303704b3ba90a835f2deaba0"
SRC_URI[sha256sum] = "e68ad89c7896f6b30f8a8dea7b8a0216dc5bfad5988cf8f287dd148069f5ccd1"

ROS_SPN = "jsk_roseus"
S = "${WORKDIR}/jsk_roseus-release-release-melodic-roseus-1.7.4-0"

inherit catkin
