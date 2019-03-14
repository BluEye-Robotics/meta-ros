DESCRIPTION = "Extends c++ type traits and implements a few more to boot."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-config ecl-mpl ecl-license ecl-mpl ecl-config"

RDEPENDS_${PN} = "ecl-license ecl-mpl ecl-config"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_type_traits/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c2521ee7ccb7e0a6121fddfd9df85a5d"
SRC_URI[sha256sum] = "d7546064c5966aa158f8340aa0583fcdc804279613ca7facee9b0b0794a6be2d"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_type_traits-0.62.2-0"

inherit catkin
