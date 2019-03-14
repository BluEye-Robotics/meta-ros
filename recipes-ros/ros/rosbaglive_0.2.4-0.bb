DESCRIPTION = "Plays rosbags as though they were happening NOW."
AUTHOR = "David V. Lu!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosbag rospy rospy rosbag"

RDEPENDS_${PN} = "rospy rosbag"

SRC_URI = "https://github.com/wu-robotics/wu_ros_tools/archive/release/melodic/rosbaglive/0.2.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bea8caa0ff6a69e4b5c7fdb47b0b15ee"
SRC_URI[sha256sum] = "96a3356c1fe0467cb3049b0a3962a1a987b55aa11fc69d4dfdd9e7ec9c4d666e"

ROS_SPN = "wu_ros_tools"
S = "${WORKDIR}/wu_ros_tools-release-melodic-rosbaglive-0.2.4-0"

inherit catkin
