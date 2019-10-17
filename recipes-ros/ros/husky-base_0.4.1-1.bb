DESCRIPTION = "Clearpath Husky robot driver"
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-manager diagnostic-updater diagnostic-msgs hardware-interface husky-msgs roscpp roslaunch roslint sensor-msgs controller-manager diagnostic-updater diagnostic-msgs diagnostic-aggregator diff-drive-controller geometry-msgs hardware-interface husky-control husky-msgs husky-description roscpp sensor-msgs topic-tools"

RDEPENDS_${PN} = "controller-manager diagnostic-updater diagnostic-msgs diagnostic-aggregator diff-drive-controller geometry-msgs hardware-interface husky-control husky-msgs husky-description roscpp sensor-msgs topic-tools"

SRC_URI = "https://github.com/clearpath-gbp/husky-release/archive/release/melodic/husky_base/0.4.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "44b397f72443ea605a43df8fe0e237a1"
SRC_URI[sha256sum] = "0e3a08f2275b71b5c1136a17d0857857e20df49fc2de2ad5d88cb180801dedd3"

ROS_SPN = "husky"
S = "${WORKDIR}/husky-release-release-melodic-husky_base-0.4.1-1"

inherit catkin
