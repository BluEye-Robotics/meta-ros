DESCRIPTION = "The containers included here are intended to extend the stl containers. In all cases, these implementations are designed to implement c++ conveniences and safety where speed is not sacrificed. Also includes techniques for memory debugging of common problems such as buffer overruns."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-config ecl-errors ecl-exceptions ecl-formatters ecl-converters ecl-mpl ecl-type-traits ecl-utilities ecl-license ecl-config ecl-errors ecl-exceptions ecl-formatters ecl-converters ecl-mpl ecl-type-traits ecl-utilities"

RDEPENDS_${PN} = "ecl-license ecl-config ecl-errors ecl-exceptions ecl-formatters ecl-converters ecl-mpl ecl-type-traits ecl-utilities"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_containers/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ccbe02d6f7e55f7b87a9918913ce548b"
SRC_URI[sha256sum] = "754395eafaca8f39801e1b53e4abc321787bbb47341aa82a767b507651114126"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_containers-0.62.2-0"

inherit catkin
