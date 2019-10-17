DESCRIPTION = "Includes emacs scripts, ros tool alias generator, and launch doc generator."
AUTHOR = "Ryohei Ueda (ueda@jsk.t.u-tokyo.ac.jp)"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "git rosgraph-msgs cv-bridge python3-percol python3-colorama python3-pygithub3 python3-progressbar python3-rosdep python3-slacker-cli python3-tabulate-pip python3-texttable python3-requests rosgraph-msgs rospy rqt-reconfigure iproute2 jsk-gui-msgs jsk-network-tools jsk-topic-tools rosbag rosemacs"

RDEPENDS_${PN} = "cv-bridge python3-percol python3-colorama python3-pygithub3 python3-progressbar python3-rosdep python3-slacker-cli python3-tabulate-pip python3-texttable python3-requests rosgraph-msgs rospy rqt-reconfigure iproute2 jsk-gui-msgs jsk-network-tools jsk-topic-tools rosbag rosemacs"

SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/melodic/jsk_tools/2.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9f0096a9a5f52a59a224a1e79e0eb39f"
SRC_URI[sha256sum] = "f320ae1c4775755b4236236bc4b43ea7b941cb2ecd775f2d5e0d004ec45db61c"

ROS_SPN = "jsk_common"
S = "${WORKDIR}/jsk_common-release-release-melodic-jsk_tools-2.2.10-0"

inherit catkin
