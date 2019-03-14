DESCRIPTION = "Face detection in images."
AUTHOR = "Caroline Pantofaru"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation actionlib actionlib-msgs cv-bridge geometry-msgs image-geometry image-transport people-msgs rosbag roscpp roslib rospy sensor-msgs std-msgs std-srvs stereo-msgs tf message-filters stereo-image-proc message-runtime"

RDEPENDS_${PN} = "dynamic-reconfigure message-runtime"

SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/melodic/face_detector/1.1.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8a0e59320ab84479c93a9261fc50839d"
SRC_URI[sha256sum] = "ae5364cd22c42db83150c148f0d9981ff3568b5285630029b87b491f64b6e1a5"

ROS_SPN = "people"
S = "${WORKDIR}/people-release-release-melodic-face_detector-1.1.2-0"

inherit catkin
