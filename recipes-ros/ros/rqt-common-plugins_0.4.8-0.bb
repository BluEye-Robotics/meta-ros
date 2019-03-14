DESCRIPTION = "rqt_common_plugins metapackage provides ROS backend graphical tools suite that can be used on/off of robot runtime."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rqt-action rqt-bag rqt-bag-plugins rqt-console rqt-dep rqt-graph rqt-image-view rqt-launch rqt-logger-level rqt-msg rqt-plot rqt-publisher rqt-py-common rqt-py-console rqt-reconfigure rqt-service-caller rqt-shell rqt-srv rqt-top rqt-topic rqt-web"

RDEPENDS_${PN} = "rqt-action rqt-bag rqt-bag-plugins rqt-console rqt-dep rqt-graph rqt-image-view rqt-launch rqt-logger-level rqt-msg rqt-plot rqt-publisher rqt-py-common rqt-py-console rqt-reconfigure rqt-service-caller rqt-shell rqt-srv rqt-top rqt-topic rqt-web"

SRC_URI = "https://github.com/ros-gbp/rqt_common_plugins-release/archive/release/melodic/rqt_common_plugins/0.4.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bf0832c781021b82feda25e15213b1c8"
SRC_URI[sha256sum] = "f0c64a0ec07274960b5e4eb9c032c6c439e67a82b0ae25c4cc9d27be2ecacc83"

S = "${WORKDIR}/rqt_common_plugins-release-release-melodic-rqt_common_plugins-0.4.8-0"

inherit catkin
