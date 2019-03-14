DESCRIPTION = "The Pepperl+Fuchs R2000 laser range finder driver package"
AUTHOR = "Denis Dillenberger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp sensor-msgs std-msgs roscpp sensor-msgs std-msgs"

RDEPENDS_${PN} = "roscpp sensor-msgs std-msgs"

SRC_URI = "https://github.com/dillenberger/pepperl_fuchs-release/archive/release/melodic/pepperl_fuchs_r2000/0.1.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9b170f6a4bc8617663557590598a1d53"
SRC_URI[sha256sum] = "833c1e411a45ec3640a3b9711241ef46c5ba36ceaa0ee0496d183f4fbb246c1f"

ROS_SPN = "pepperl_fuchs"
S = "${WORKDIR}/pepperl_fuchs-release-release-melodic-pepperl_fuchs_r2000-0.1.3-0"

inherit catkin
