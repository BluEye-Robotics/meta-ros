DESCRIPTION = "rosbag with terminal UI"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "boost libncurses-dev rosbag-storage roscpp rosfmt topic-tools"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/xqms/rosbag_fancy-release/archive/release/melodic/rosbag_fancy/0.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "66af6348866631bb92e9203ffce6615f"
SRC_URI[sha256sum] = "1cb76b16313a6cde9bf2e39d3be308af886107c0553b1141caa6a306309a3002"

S = "${WORKDIR}/rosbag_fancy-release-release-melodic-rosbag_fancy-0.1.1-1"

inherit catkin
