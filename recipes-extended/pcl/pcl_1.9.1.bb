DESCRIPTION = "The Point Cloud Library (or PCL) for point cloud processing."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5b8a2a1aa14e6de44b4273134946a34c"

DEPENDS = "boost libflann libeigen qhull"

SRC_URI = "https://github.com/PointCloudLibrary/${PN}/archive/${P}.tar.gz"
SRC_URI[md5sum] = "4d4cfb6bf87cc1f08703deeeac1eb6e2"
SRC_URI[sha256sum] = "0add34d53cd27f8c468a59b8e931a636ad3174b60581c0387abb98a9fc9cddb6"

SRC_URI += "file://0001-Remove-system-from-cmake.patch"

S = "${WORKDIR}/pcl-${P}"

EXTRA_OECMAKE += "\
  -DCMAKE_SKIP_RPATH=ON \
  -DHAVE_MM_MALLOC_EXITCODE=0 \
  -DHAVE_POSIX_MEMALIGN_EXITCODE=0 \
   ${@bb.utils.contains("TARGET_CC_ARCH", "-msse4.2", "-DHAVE_SSE4_2_EXTENSIONS_EXITCODE=0", "-DHAVE_SSE4_2_EXTENSIONS_EXITCODE=1", d)} \
   ${@bb.utils.contains("TARGET_CC_ARCH", "-msse4.1", "-DHAVE_SSE4_1_EXTENSIONS_EXITCODE=0", "-DHAVE_SSE4_1_EXTENSIONS_EXITCODE=1", d)} \
  -DHAVE_SSSE3_EXTENSIONS_EXITCODE=0 \
   ${@bb.utils.contains("TARGET_CC_ARCH", "-msse3", "-DHAVE_SSE3_EXTENSIONS_EXITCODE=0", "-DHAVE_SSE3_EXTENSIONS_EXITCODE=1", d)} \
   ${@bb.utils.contains("TARGET_CC_ARCH", "-msse2", "-DHAVE_SSE2_EXTENSIONS_EXITCODE=0", "-DHAVE_SSE2_EXTENSIONS_EXITCODE=1", d)} \
   ${@bb.utils.contains("TARGET_CC_ARCH", "-msse", "-DHAVE_SSE_EXTENSIONS_EXITCODE=0", "-DHAVE_SSE_EXTENSIONS_EXITCODE=1", d)} \
  -DWITH_LIBUSB=FALSE \
  -DWITH_PNG=FALSE \
  -DWITH_QHULL=TRUE \
  -DWITH_CUDA=FALSE \
  -DWITH_QT=FALSE \
  -DWITH_VTK=FALSE \
  -DWITH_PCAP=FALSE \
  -DWITH_OPENGL=FALSE \
"

#Setting -ffloat-store to alleviate 32bit vs 64bit discrepancies on non-SSE platforms.
CXXFLAGS += "${@bb.utils.contains("TARGET_CC_ARCH", "-mfpmath=sse", "", "-ffloat-store", d)}"

inherit cmake

FILES_${PN}-dev += "${datadir}/${PN}-1.9/*.cmake"
FILES_${PN}-dev += "${datadir}/${PN}-1.9/Modules/*.cmake"
