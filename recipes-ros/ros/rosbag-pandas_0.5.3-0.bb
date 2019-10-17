DESCRIPTION = "Create a Pandas data frame from a ros bag file."
AUTHOR = "Adam Taylor"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "python3-matplotlib python3-numpy python3-pandas rosbag rospy-message-converter roslib"

SRC_URI = "https://github.com/eurogroep/rosbag_pandas-release/archive/release/melodic/rosbag_pandas/0.5.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7524acf6ce0198fc3797d9c3d878a2ae"
SRC_URI[sha256sum] = "a1e49a019fe7770b6a4de2ba9c8551c78e6288b2a32f7da4227f97d48e929a9f"

S = "${WORKDIR}/rosbag_pandas-release-release-melodic-rosbag_pandas-0.5.3-0"

inherit catkin
